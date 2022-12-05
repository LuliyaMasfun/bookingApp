
import React from "react";
import "../../css/style.css"

const Register = () => {


    return (

        <div className="site-wrapper">
            <div className="signin-container">

                <h1>Register new account</h1>

                <div className="signin-form-container">

                    <form className="form">

                        <div className="input-holder">
                            <label htmlFor="name"></label>
                            <input id="name" type="text" placeholder="name" />
                        </div>

                        <div className="input-holder">
                            <label htmlFor="password"></label>
                            <input id="password" type="text" placeholder="password" />
                        </div>

                        <div className="input-holder">
                            <label htmlFor="email"></label>
                            <input id="email" type="text" placeholder="email" />
                        </div>

                        <button className="primary-btn" type="submit"> Create an account</button>

                        <div className="message">
                            <p> Already have an account?<br />
                                <a href="/">Log in here</a>
                            </p>
                        </div>
                    </form>



                </div>
            </div >


        </div >
    )
}

export default Register