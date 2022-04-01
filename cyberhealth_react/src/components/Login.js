import { useState } from "react";
import { Link } from "react-router-dom";

const Login = () => {

    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("")

    const fun = () => {
        console.log(email, password);
    }

    return ( 

        <div className="login-body">

            <form>

                <p>Email:</p>
                <input type="text" name="Email" id="email" placeholder="Email" onChange={ e => setEmail(e.target.value) } />

                <p>Password:</p>
                <input type="password" name="Password" id="password" placeholder="Password" onChange={ e => setPassword(e.target.value) } />

                <button onClick={ () => fun() } >Login</button>
                <p>Dont have account</p> <Link to="/signup">Signup</Link>
            </form>

        </div>

     );
}
 
export default Login;