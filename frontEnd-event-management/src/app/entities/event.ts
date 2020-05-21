import { Avis } from "./avis";
import { User } from "src/app/entities/user";
import { Panier } from "./panier";
import { Requirement } from "./requirement";

export class Event {
    id : number
    name: string
    description : string
    date: Date
    budget: number
    panier: Panier
    requiremnts: Requirement[]

 /*   constructor(name: string, description: string,date: Date,budget:number,panier:Panier) {
        this.name=name;
        this.description=description;
        this.date=date;
        this.budget=budget;
        this.panier=panier;
        
    }*/

  }
  