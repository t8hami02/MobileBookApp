import { initializeApp } from "firebase/app";
import { getDatabase, ref } from "firebase/database";
//import {getAuth} from 'firebase/auth';

const firebaseConfig = {
    apiKey: "AIzaSyAk1veQmjbAUAnyU4WtpDNCWQQcPXRRf8A", 
    authDomain: "bookapp-c7b71.firebaseapp.com",  
    databaseURL: "https://bookapp-c7b71-default-rtdb.europe-west1.firebasedatabase.app", 
    projectId: "bookapp-c7b71",
    storageBucket: "bookapp-c7b71.appspot.com", 
    messagingSenderId: "39508753061", 
    appId: "1:39508753061:web:a6aee52ee29b92d0a1ab4c", 
    measurementId: "G-KZ45G3Z9YQ"  
  };
  
const app = initializeApp(firebaseConfig);
console.log('test from index.js');

/*
function writeUserData(userId, name, email){
    const db = getDatabase();
    const reference = ref(db, 'Users/' + userId);

    set(reference,{
        username: name,
        email: email,
    });   
}

writeUserData("testUser", "testName", "testUserEmail@me.com");
*/