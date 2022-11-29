import React from "react";
import "../../css/layout.css"
import "../../css/animation.css";
import "../../css/formBox.css";
import "../../css/style.css";


const LoginPage = () => {

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
            createValidImg.setAttribute("className", "validNameImg");
            createValidImg.setAttribute("id", "validNameImg");
            const findDiv = document.getElementById("formBox");
            findDiv.appendChild(createValidImg);
        } else if (inputFullname === "") {
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
            createValidImg.setAttribute("className", "invalidNameImg");
            createValidImg.setAttribute("id", "invalidNameImg");
            const findDiv = document.getElementById("formBox");
            findDiv.appendChild(createValidImg);
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
            createValidImg.setAttribute("className", "validPasswordImg");
            createValidImg.setAttribute("id", "validPasswordImg");
            const findDiv = document.getElementById("formBox");
            findDiv.appendChild(createValidImg);
        } else if (inputFullname === "") {
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
            createValidImg.setAttribute("className", "invalidPasswordImg");
            createValidImg.setAttribute("id", "invalidPasswordImg");
            const findDiv = document.getElementById("formBox");
            findDiv.appendChild(createValidImg);
        }
    }

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

            const createValidImg = document.createElement("img");
            createValidImg.src = "/src/main/resources/static/images/valid.png";
            createValidImg.setAttribute("className", "validEmailImg");
            createValidImg.setAttribute("id", "validEmailImg");
            const findDiv = document.getElementById("formBox");
            findDiv.appendChild(createValidImg);
        } else if (inputFullname === "") {
            const findInvalidImg = document.getElementById("invalidEmailImg");
            const findvalidImg = document.getElementById("validEmailImg");
            if (findInvalidImg != null || findvalidImg != null) {
                findInvalidImg.remove();
                findvalidImg.remove();
            }
        } else {
            const findvalidImg = document.getElementById("validEmailImg");
            const findInvalidImg = document.getElementById("invalidEmailImg");
            if (findInvalidImg != null) {
                findInvalidImg.remove();
            }
            if (findvalidImg != null) {
                findvalidImg.remove();
            }

            const createValidImg = document.createElement("img");
            createValidImg.src = "/src/main/resources/static/images/invalid.png";
            createValidImg.setAttribute("className", "invalidEmailImg");
            createValidImg.setAttribute("id", "invalidEmailImg");
            const findDiv = document.getElementById("formBox");
            findDiv.appendChild(createValidImg);
        }
    }

    const register = () => {
        const checkIfEmailIsValid = document.getElementById("validEmailImg");
        const checkIfFullNameIsValid = document.getElementById("validNameImg");
        const checkIfPasswordIsValid = document.getElementById("validPasswordImg");

        if (
            checkIfEmailIsValid != null &&
            checkIfFullNameIsValid != null &&
            checkIfPasswordIsValid != null
        ) {
            const inputFullname = document.getElementById("formFullName").value;
            const inputEmail = document.getElementById("formEmail").value;
            const inputPassword = document.getElementById("formPassword").value;

            let postObj = {
                fullName: inputFullname,
                email: inputEmail,
                password: inputPassword,
            };

            let post = JSON.stringify(postObj);
            console.log(post);
            console.log("Knappen funkar");

            const xhr = new XMLHttpRequest();
            xhr.open("POST", "http://localhost:8081/registration");
            xhr.setRequestHeader("Content-Type", "application/json; charset=UTF-8");
            xhr.send(post);
            xhr.onload = function () {
                if (xhr.status === 200) {
                    const data = JSON.parse(this.response);
                    console.log(data[0]);
                }
                xhr.send();
            };
        }
    }
    return (

        <>
            <html>
                <body>
                    <div className="layout">
                        <div className="welcomeScreen">
                            <p id="companyName">We make it BIG.</p>
                        </div>
                    </div>
                    <div className="whiteBackground" id="whiteBackground">
                        <div className="formBox" id="formBox">
                            <p className="accountExits">
                                Have an account? <span className="textColor">Sign In</span>
                            </p >

                            <p className="welcomeText" id="welcomeText" > Welcome to BIG</p >

                            < p className="smallTextUnderWelcomeText" >
                                Blandit libero volutpat sed cras ornare arcu dui.Accumsan in ni nisi
                                scelerisque eu.
                            </p >

                            <div className="formINput" id="formInput" >
                                < p className="smallTextAbove1" > Full name</p >

                                < input
                                    className="fullNameForm"
                                    type="text"
                                    placeholder="Username"
                                    id="formFullName"
                                    onkeydown={validateFullName}
                                />
                                <p className="smallTextAbove2" > E - mail</p >
                                < input
                                    className="fullNameForm"
                                    type="text"
                                    placeholder="example@gmail.com"
                                    id="formEmail"
                                    onkeydown={validateEmail}
                                />
                                <p className="smallTextAbove3" > Password</p >
                                < input
                                    className="fullNameForm"
                                    type="password"
                                    placeholder="8+ strong character"
                                    id="formPassword"
                                    onkeydown={validatePassword}
                                />
                                <button className="submitButton" type="button" onClick={register} >
                                    Create an account
                                </button >
                            </div >
                        </div >
                    </div >
                    <script src="/src/js/validateLogIn.js"></script>
                </body >
            </html >
        </>
    )
}
export default LoginPage