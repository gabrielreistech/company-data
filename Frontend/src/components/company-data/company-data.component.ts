import { Component } from '@angular/core';

@Component({
  selector: 'app-company-data',
  templateUrl: './company-data.component.html',
  styleUrl: './company-data.component.css'
})
export class CompanyDataComponent {

  goal:number = 1000000;

  valueAlterGoal:number | null = null;

  alterValueGoal(valueAlterGoal:number | null){
    if(valueAlterGoal == null || valueAlterGoal < 0){
       this.goal = this.goal;
    } else{
      this.goal = valueAlterGoal;
      this.valueAlterGoal = null;
    }
  }
}
