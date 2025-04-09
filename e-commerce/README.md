# e-commerce

---

The ```e-commerce``` repository contains the 'e-commerce' project.

## Types of e-commerce
- Business-to-Business (B2B)
- Business-to-Consumer (B2C)
- Consumer-to-Consumer (C2C)
- Consumer-to-Business (C2B)

## Folder Structure Conventions

---

```
    /
    ├── modules                     # The modules
    ├── e-commerce                  # The e-commerce Service
    |    ├── ecommerce              # The IWS Service
    |    ├── estore                 # The EWS Service
    |    └── README.md
    └── README.md
```


# Building Application

---

The example application is an ```e-commerce``` site with the following features:

- Visitors can sign up, log in, and recover passwords.
- Visitors can search for products and view their details.
- Users can add products to their cart and checkout.
- An API enables external systems to search and retrieve product information.

You don’t need to care much about the details of the implementation. 
Instead, you’ll focus mainly on how a ```Flask Blueprint``` can be used to improve the application’s architecture.


## Modules

- [ecommerce-iws](./ecommerce/README.md)
- [ecommerce-ews](./ewebapp/README.md)



# Author

---

- Rohtash Lakra
