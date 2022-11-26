import React from "react";
import "../../css/layout.css"
import "../../css/animation.css";
import "../../css/formBox.css";
import "../../css/style.css";


const LoginPage = () => {
    return (

        <>
            <html>
                <body>
                    <div class="layout">
                        <div class="welcomeScreen">
                            <p id="companyName">We make it BIG.</p>
                        </div>
                    </div>
                    <div class="whiteBackground" id="whiteBackground">
                        <div class="formBox" id="formBox">
                            <p class="accountExits">
                                Have an account? <span class="textColor">Sign In</span>
                            </p>

                            <p class="welcomeText" id="welcomeText">Welcome to BIG</p>

                            <p class="smallTextUnderWelcomeText">
                                Blandit libero volutpat sed cras ornare arcu dui. Accumsan in ni nisi
                                scelerisque eu.
                            </p>

                            <div class="formINput" id="formInput">
                                <p class="smallTextAbove1">Full name</p>

                                <input
                                    class="fullNameForm"
                                    type="text"
                                    placeholder="Username"
                                    id="formFullName"
                                    onkeydown="validateFullName()"
                                />
                                <p class="smallTextAbove2">E-mail</p>
                                <input
                                    class="fullNameForm"
                                    type="text"
                                    placeholder="example@gmail.com"
                                    id="formEmail"
                                    onkeydown="validateEmail()"
                                />
                                <p class="smallTextAbove3">Password</p>
                                <input
                                    class="fullNameForm"
                                    type="password"
                                    placeholder="8+ strong character"
                                    id="formPassword"
                                    onkeydown="validatePassword()"
                                />
                                <button class="submitButton" type="button" onclick="register()">
                                    Create an account
                                </button>
                            </div>
                        </div>
                    </div>
                    <script src="/src/js/validateLogIn.js"></script>
                </body>
            </html>
        </>
    )
}
export default LoginPage