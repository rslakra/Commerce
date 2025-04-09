# ecommerce-iws

---

The ```ecommerce-iws``` represents an internal web service.


## Folder Structure Conventions

---

```
    /
    ├── modules                       # The name of the module    
    ├── ecommerce                     # The ecommerce-ews external module/service
    |    ├── account                  # an account’s rest service.
    |    |    ├── v1                  # contains the application’s static files.
    |    |    |    ├── controller     # module specific css files
    |    |    |    ├── routes         # module specific image files
    |    |    ├── v2                  # contains the module’s templates.
    |    |    |    ├── controller     # contains the module web views.
    |    |    ├── __init__.py         # contains the definition of the module's routes.
    |    ├── admin                    # an admin’s rest service.
    |    ├── api                      # The API service
    |    ├── cart                     # The HTML views/pages of accounts
    |    ├── models                   # contains the definition of the application’s models.
    |    ├── webapp                   # contains the definition of the webapp’s module.
    |    |    ├── account             # contains the account’s templates.
    |    |    |    ├── _navbar.html   # contains the reusable fragments of web views.
    |    |    ├── admin               # contains the admin’s templates.
    |    |    |    ├── _navbar.html   # contains the reusable fragments of web views.
    |    |    ├── cart                # contains the cart’s templates.
    |    |    |    ├── _navbar.html   # contains the reusable fragments of web views.
    |    |    ├── static              # contains the application’s static files.
    |    |    |    ├── css            # contains the application's css files
    |    |    |    ├── images         # contains the application's image files
    |    |    |    ├── js             # contains the application's JavaScript files
    |    |    ├── templates           # contains the application’s templates.
    |    |    |    ├── fragments      # contains the reusable fragments of web views.
    |    |    ├── __init__.py         # contains the main application logic.
    |    |    ├── app.py              # contains the web application logic.
    |    |    ├── routes.py           # contains the definition of the web’s routes.
    |    ├── __init__.py              # contains the main application logic.
    |    ├── config.py                # contains the application configuration parameters.
    |    └── README.md                # The README file of ews module
    └── README.md
```


Although this layout is pretty straightforward, it has several drawbacks that arise as the app complexity increases. 
For example, it will be hard for you to reuse the application logic in other projects because all the functionality is 
bundled in ```webapp/__init__.py```. If you split this functionality into modules instead, then you could reuse complete modules 
across different projects.



# Building Application

---

## Create Virtual Env
```shell
python3 -m pip install virtualenv
python3 -m venv venv
```

## Activate ```venv```

```source``` is Linux/macOS command and doesn't work in Windows.

- Windows

    ```shell
    venv\Scripts\activate
    ```

- Mac OS/Linux

    ```shell
    source venv/bin/activate
  
  OR
  
    . ./venv/bin/activate  
    ```

The parenthesized (venv) in front of the prompt indicates that you’ve successfully activated the virtual environment.

## Deactivate Virtual Env
```shell
deactivate
```

## Upgrade ```pip``` release

```shell
pip install --upgrade pip
```

## Install Packages

- Install Flask

**Note**: - You can skip ```Install Packages``` steps and run [Install Requirements](./Install_Requirements) steps directly. But if any error comes, come back to run these steps.

```shell
python3 -m pip install Flask
```


## Install Requirements

```shell
python3 -m pip install --upgrade pip
python3 -m pip install -r requirements.txt
```



## Save Requirements (Dependencies)
```shell
pip freeze > requirements.txt
```


## Configuration Setup

Set local configuration file.

```shell
pip install python-dotenv
cp default.env .env
```

Now, update the default local configurations as follows:

```text
APP_HOST = 0.0.0.0
APP_PORT = 8081
```

**By default**, Flask will run the application on **port 5000**.

## Run Flask Application

```shell
python -m flask --app webapp run --port 8081 --debug
```

**Note**:- You can stop the development server by pressing ```Ctrl+C``` in your terminal.


## Access Application
```shell
http://localhost:8081/ecommerce-iws
```


# Author

---

- Rohtash Lakra
