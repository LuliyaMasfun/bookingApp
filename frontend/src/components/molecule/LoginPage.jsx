import React, { useState } from "react";
import "../../css/style.css";

const LoginPage = () => {

    const [email, setEmail] = useState("")
    const [password, setpassword] = useState("")





    return (

        <div className='site-wrapper'>
            <div className='login-container'>
                <h1>
                    Logga in
                </h1>
                <div className='login-form-container'>
                    <form>
                        <div className='login-form-wrapper'>
                            <div className='input-holder'>
                                <label htmlFor="email">Email</label>
                                <input id="email" type='text' placeholder='JohnDoe@gmail.com'></input>
                            </div>
                            <div className='input-holder'>
                                <label htmlFor="password">Password</label>
                                <input id="password" type='text' placeholder='JohnDoe@gmail.com'></input>
                            </div>
                        </div>
                        {/* <div className='register-btn-container'>
                            <button className='text-btn'>Register</button>
                            <button className='text-btn'>Forgot password?</button>
                        </div> */}
                        <button type='submit' className='primary-btn'>
                            Log In
                        </button>

                        <div className="message">
                            <p>Don´t have an account?<br />
                                <a href="/register"> Register here</a>
                            </p>
                        </div>
                    </form>
                </div>
            </div >
        </div >

    )
}
export default LoginPage