class Part {
    constructor(id, description, warehouse, numberLocal, quantity) {
        this.id = id;
        this.description = description;
        this.warehouse = warehouse;
        this.numberLocal = numberLocal;
        this.quantity = quantity;
    }

    setAttributes() {
        this.id = document.getElementById("input-id").value;
        this.description = document.getElementById("input-description").value;
        this.warehouse = document.getElementById("input-warehouse").value;
        this.numberLocal = document.getElementById("input-numberLocal").value;
        this.quantity = document.getElementById("input-quantity").value;
    }
    getBody() {
        this.setAttributes();
        return JSON.stringify(
            {
                id: this.id,
                description: this.description,
                warehouse: this.warehouse,
                numberLocal: this.numberLocal,
                quantity: this.quantity
            }
        );
    }

}