import React, { useState } from "react";
import "../../css/layout.css"
import "../../css/animation.css";
import "../../css/formBox.css";
import "../../css/style.css";
import SignIn from "./SignIn";


const LoginPage = () => {

    const [email, setEmail] = useState("");
    const [name, setName] = useState("");
    const [password, setPassword] = useState("")

    const validateEmail = () => {
        const inputFullname = document.getElementById("formEmail").value;
        const inputFullNameWithoutValue = document.getElementById("formEmail");
        const pattern =
            /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
        if (inputFullname.match(pattern)) {
            const findInvalidImg = document.getElementById("invalidEmailImg");
            const findvalidImg = document.getElementById("validEmailImg");
            if (findInvalidImg != null) {
                findInvalidImg.remove();
            }
            if (findvalidImg != null) {
                findvalidImg.remove();
            }
        }
    }

    const validatePassword = () => {
        const inputFullname = document.getElementById("formPassword").value;
        const inputFullNameWithoutValue = document.getElementById("formPassword");
        const pattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d\w\W]{8,}$/;
        if (inputFullname.match(pattern)) {
            const findInvalidImg = document.getElementById("invalidPasswordImg");
            const findvalidImg = document.getElementById("validPasswordImg");
            if (findInvalidImg != null) {
                findInvalidImg.remove();
            }
            if (findvalidImg != null) {
                findvalidImg.remove();
            }

            const createValidImg = document.createElement("img");
            createValidImg.src = "/src/main/resources/static/images/valid.png";
            createValidImg.setAttribute("class", "validPasswordImg");
            createValidImg.setAttribute("id", "validPasswordImg");
            const findDiv = document.getElementById("formBox");
            findDiv.appendChild(createValidImg);
        } else if (inputFullname == "") {
            const findInvalidImg = document.getElementById("invalidPasswordImg");
            const findvalidImg = document.getElementById("validPasswordImg");
            if (findInvalidImg != null || findvalidImg != null) {
                findInvalidImg.remove();
                findvalidImg.remove();
            }
        } else {
            const findvalidImg = document.getElementById("validPasswordImg");
            const findInvalidImg = document.getElementById("invalidPasswordImg");
            if (findInvalidImg != null) {
                findInvalidImg.remove();
            }
            if (findvalidImg != null) {
                findvalidImg.remove();
            }

            const createValidImg = document.createElement("img");
            createValidImg.src = "/src/main/resources/static/images/invalid.png";
            createValidImg.setAttribute("class", "invalidPasswordImg");
            createValidImg.setAttribute("id", "invalidPasswordImg");
            const findDiv = document.getElementById("formBox");
            findDiv.appendChild(createValidImg);
        }
    }

    const validateFullName = () => {
        const inputFullname = document.getElementById("formFullName").value;
        const inputFullNameWithoutValue = document.getElementById("formFullName");
        const pattern = /^[a-zA-Z\s]+$/;
        if (inputFullname.match(pattern)) {
            const findInvalidImg = document.getElementById("invalidNameImg");
            const findvalidImg = document.getElementById("validNameImg");
            if (findInvalidImg != null) {
                findInvalidImg.remove();
            }
            if (findvalidImg != null) {
                findvalidImg.remove();
            }

            const createValidImg = document.createElement("img");
            createValidImg.src = "/src/main/resources/static/images/valid.png";
            createValidImg.setAttribute("class", "validNameImg");
            createValidImg.setAttribute("id", "validNameImg");
            const findDiv = document.getElementById("formBox");
            findDiv.appendChild(createValidImg);
        } else if (inputFullname == "") {
            const findInvalidImg = document.getElementById("invalidNameImg");
            const findvalidImg = document.getElementById("validNameImg");
            if (findInvalidImg != null || findvalidImg != null) {
                findInvalidImg.remove();
                findvalidImg.remove();
            }
        } else {
            const findvalidImg = document.getElementById("validNameImg");
            const findInvalidImg = document.getElementById("invalidNameImg");
            if (findInvalidImg != null) {
                findInvalidImg.remove();
            }
            if (findvalidImg != null) {
                findvalidImg.remove();
            }

            const createValidImg = document.createElement("img");
            createValidImg.src = "/src/main/resources/static/images/invalid.png";
            createValidImg.setAttribute("class", "invalidNameImg");
            createValidImg.setAttribute("id", "invalidNameImg");
            const findDiv = document.getElementById("formBox");
            findDiv.appendChild(createValidImg);
        }
    }

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
                                onKeyDown={validateFullName}
                            />
                            <p className="smallTextAbove2" > E - mail</p >
                            <input
                                className="fullNameForm"
                                type="text"
                                placeholder="example@gmail.com"
                                id="formEmail"
                                onKeyDown={validateEmail}
                            />
                            <p className="smallTextAbove3" > Password</p >
                            <input
                                className="fullNameForm"
                                type="password"
                                placeholder="8+ strong character"
                                id="formPassword"
                                onKeyDown={validatePassword}
                            />
                            <button className="submitButton" type="button" onClick="register()" >
                                Create an account
                            </button >
                        </div >
                    </div >
                </div >

            </div>

            <SignIn />
        </div >
    )
}
export default LoginPage