import React from "react";
export class Prime extends React.Component

{
    state = {
        num: 9,
        i: 2,
        s:null
      };

   constructor()
   {
    super();
   }

   render()
   {

    const { num } = this.state;
    for(this.state.i=2;this.state.i<num;this.state.i++)
    {
        if(num%this.state.i==0)

        {
            this.state.s = "not prime";
            break;
        }
    }

    if(num==this.state.i)

    {
        this.state.s = "prime";
    }
    return(

       <div>
       <p>{this.state.s}</p>
       </div>
       )
   } 
}

