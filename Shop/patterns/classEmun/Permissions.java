package Shop.patterns.classEmun;

public enum Permissions {
    canAddProduct,
    canAddCustomer,
    canAddSeller,
    canAddWorker,


    canSeeProduct,
    canSeeCustomer,
    canSeeSeller,
    canSeeWorker,

//    Product ---
    canSeeProductProfile,
    canSeeProductPrivateData,

    canChangeProductProfil,
    canChangeProductPrivateData,


//    Customer ---
    canSeeCustomerProfile,
    canSeeCustomerPrivateData,

    canChangeCustomerProfile,
    canChangeCustomerPrivateData,


//    Saler ---
    canSeeSallerProrile,
    canSeeSallerPrivateData,

    canChangeSellerProfile,
    canChangeSellerPrivateData,


//    Worker ---
    canSeeWorkerProfile,
    canSeeWorkerPrivateData,

    canChangeWorkerProfile,
    canChangeWorkerPrivateData,


//    -------------------------

}

