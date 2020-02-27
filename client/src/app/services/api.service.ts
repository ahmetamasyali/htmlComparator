import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root'
})
export class ApiService {

    private REST_API_SERVER = "http://localhost:8080";

    constructor(private httpClient: HttpClient) { }

    public compareRequest(firstString: String, secondString: String){
        return this.httpClient.post(this.REST_API_SERVER + "/compare",
            {'firstHtml':firstString, 'secondHtml':secondString});
    }
}