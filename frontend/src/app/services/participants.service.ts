import { Injectable } from '@angular/core';
import {Observable, of} from "rxjs";
import {Participant} from "../model/participant.model";
import {UUID} from "angular2-uuid";
import {HttpClient} from "@angular/common/http";
import {environment} from "../../environments/environment";
import {Report} from "../model/report.model";
import {Constant} from "../model/constant.model";

@Injectable({
  providedIn: 'root'
})
export class ParticipantsService {
  private apiServerUrl=environment.apiBaseUrl;
  constructor(private  http: HttpClient) { }
  public getParticipants():  Observable<Participant[]>{
    return this.http.get<Participant[]>(`${this.apiServerUrl}/participants`);
  }
  public addParticipant(participant: Participant): Observable<Participant>{
    return this.http.post<Participant>(`${this.apiServerUrl}/addParticipant`, participant);
  }
  public onDeleteParticipant(participant: number): Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/delete/${participant}`);
  }
  public onDeleteAll(): Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/deleteAll`);
  }
  public getReports():  Observable<Report[]>{
    return this.http.get<Report[]>(`${this.apiServerUrl}/report`);
  }
  public addReport(report: Report): Observable<Report>{
    return this.http.post<Report>(`${this.apiServerUrl}/addReport`, report);
  }
}
