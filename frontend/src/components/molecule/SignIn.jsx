
import React from "react";
import "../../css/style.css"

const SignIn = () => {


    return (
        <div className="container-SignIn">

            <header> Welcome to Big</header>

            <form className="form">
                <label className="label-form">
                    <input type="text" placeholder="name" />
                    <input type="text" placeholder="password" />
                    <input type="text" placeholder="email" />

                </label>

                <button type="submit"> Create an account</button>

            </form>





        </div>
    )
}

export default SignIn