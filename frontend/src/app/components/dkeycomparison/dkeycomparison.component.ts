import {Component, OnInit} from '@angular/core';
import {ParticipantsService} from "../../services/participants.service";
import {Participant} from "../../model/participant.model";
import {FormBuilder, FormControl, FormGroup, Validator, Validators} from "@angular/forms";
import {HttpErrorResponse} from '@angular/common/http';
import {catchError, map, Observable, of, startWith} from "rxjs";
import {AppDataState, DataStateEnum} from "../../state/participant.state";
import {Report} from "../../model/report.model";

@Component({
  selector: 'app-dkeycomparison',
  templateUrl: './dkeycomparison.component.html',
  styleUrls: ['./dkeycomparison.component.css']
})
export class DkeycomparisonComponent implements OnInit {
  title = 'dsi-Services';

  public participants$?: Observable<AppDataState<Participant[]>> ;
  participantFormGroup?: FormGroup;
  readonly DataStateEnum = DataStateEnum;
  public reports$?: Observable<AppDataState<Report[]>> ;
  reportFormGroup?: FormGroup;


  constructor(private participantsService: ParticipantsService, private fb: FormBuilder) {
  }

  ngOnInit() {
    this.getParticipants();
    this.participantFormGroup = this.fb.group({
        name: ["", Validators.required],
        dccPid: ["", Validators.required]
      }
    )
    this.reportFormGroup =this.fb.group({
      pidReport:["",Validators.required],
    })

    // sessionStorage.removeItem('participnatsList')
  }

  public getParticipants(): void {
    this.participants$ = this.participantsService.getParticipants().pipe(
      map(data => ({dataState: DataStateEnum.LOADED, data: data})),
      startWith({dataState: DataStateEnum.LOADING}),
      catchError(err => of({dataState: DataStateEnum.ERROR, errorMessage: err.message}))
    );
  }

  public onDeleteParticipant(p: Participant) {
    let message = confirm("Are you sure to delete " + p.name);
    if (message = true)
      this.participantsService.onDeleteParticipant(p.id).subscribe(data => {
        this.getParticipants();
      });
  }
  // public clearParticipantsList(){
  //   this.participantsService.onDeleteAll().subscribe(data => {
  //
  //   });
  // }
  public addParticipant() {
    this.participantsService.addParticipant(this.participantFormGroup?.value)
      .subscribe(data => {
        this.getParticipants()
        alert("added successfully")
      });
    this.participantFormGroup?.reset();
    //sessionStorage.setItem('participnatsList', JSON.stringify( this.participantsService.getParticipants()))
  }

  public getReports(): void {
    this.reports$ = this.participantsService.getReports().pipe(
      map(data => ({dataState: DataStateEnum.LOADED, data: data})),
      startWith({dataState: DataStateEnum.LOADING}),
      catchError(err => of({dataState: DataStateEnum.ERROR, errorMessage: err.message}))
    );
  }
  public addReport() {
    this.participantsService.addReport(this.reportFormGroup?.value)
      .subscribe(data => {
        this.getReports()
        alert("added successfully")
      });
    this.reportFormGroup?.reset();
  }
}


