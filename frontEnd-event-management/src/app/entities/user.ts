import { Avis } from "./avis";
import { Panier } from "./panier";

export class User {
    id : number
    name : String
    username : String
    email : String
    password : String
    avis : Avis[]
    roles : any[]
    panier: Panier
  }
  