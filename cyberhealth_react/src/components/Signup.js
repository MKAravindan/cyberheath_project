import { useState } from "react";
import { Link } from "react-router-dom";

const Signup = () => {
    
    const [email, setEmail] = useState("");
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [MobileNumber, setMobileNumber] = useState("");

    
    const fun = () => {

        fetch(() => {

        })
    }

    return ( 
        <div className="signup-body">

            <form>

            <p>Email:</p>
            <input type="text" name="Email" id="email" placeholder="Email" onChange = { e => setEmail(e.target.value) } />

            <p>Username:</p>
            <input type="text" name="Username" id="username" placeholder="Username" onChange = { e => setUsername(e.target.value) } />

            <p>Password:</p>
            <input type="password" name="Password" id="password" placeholder="Password" onChange = { e => setPassword(e.target.value) } />

            <p>Mobile Number:</p>
            <input type="text" name="MobileNumber" id="mobileNumber" placeholder="Mobile Number" onChange = { e => setMobileNumber(e.target.value) } />

            <button  onClick = { () => fun() }>Sign Up</button>
            <p>Have account</p> <Link to="/login">Login</Link>

            </form>

        </div>
     );
}
 
export default Signup;