import React from "react";
import "../../css/layout.css"
import "../../css/animation.css";
import "../../css/formBox.css";
import "../../css/style.css";


const LoginPage = () => {

    return (

        <div className="container">
            <div className="input_container">

                <div className="layout">
                    <div className="welcomeScreen">
                        <p id="companyName">We make it BIG.</p>
                    </div>
                </div >
                <div className="whiteBackground" id="whiteBackground" >
                    <div className="formBox" id="formBox" >
                        <p className="accountExits" >
                            Have an account ? <span className="textColor" > Sign In</span >
                        </p >

                        <p className="welcomeText" id="welcomeText" > Welcome to BIG</p >

                        <p className="smallTextUnderWelcomeText" >
                            Blandit libero volutpat sed cras ornare arcu dui.Accumsan in ni nisi
                            scelerisque eu.
                        </p >

                        <div className="formINput" id="formInput" >
                            <p className="smallTextAbove1" > Full name</p >

                            <input
                                className="fullNameForm"
                                type="text"
                                placeholder="Username"
                                id="formFullName"
                                onkeydown="validateFullName()"
                            />
                            <p className="smallTextAbove2" > E - mail</p >
                            <input
                                className="fullNameForm"
                                type="text"
                                placeholder="example@gmail.com"
                                id="formEmail"
                                onkeydown="validateEmail()"
                            />
                            <p className="smallTextAbove3" > Password</p >
                            <input
                                className="fullNameForm"
                                type="password"
                                placeholder="8+ strong character"
                                id="formPassword"
                                onkeydown="validatePassword()"
                            />
                            <button className="submitButton" type="button" onclick="register()" >
                                Create an account
                            </button >
                        </div >
                    </div >
                </div >

            </div>
        </div >
    )
}
export default LoginPage