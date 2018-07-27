Login Test
=====================
Created by Lucasgermani on 27/07/2018

This is an executable specification file which follows markdown syntax.
This specification should test the login feature at http://testing-ground.scraping.pro/login

* Given user is at the login page


Sucesfull Login
----------------
* Perform login with username = "admin" and password "12345"
* Verify if login result is equals to "WELCOME"

Wrong username
----------------
* Perform login with username = "normaluser" and password "12345"
* Verify if login result is equals to "ACCESS_DENIED"

Wrong password
----------------
* Perform login with username = "admin" and password "01hf32f2"
* Verify if login result is equals to "ACCESS_DENIED"

Empty Credentials
----------------
* Perform login with username = "" and password ""
* Verify if login result is equals to "ACCESS_DENIED"

No password
----------------
* Perform login with username = "admin" and password ""
* Verify if login result is equals to "ACCESS_DENIED"

No username
----------------
* Perform login with username = "" and password "12345"
* Verify if login result is equals to "ACCESS_DENIED"