const productList = [{name:"pepsi", price:190}, {name:"monster", price:590}, {name:"2L pepsi", price:490}, {name:"Arizona", price:90}, {name:"live water", price:290}]

const change = [500, 200, 100, 50, 20, 10];

const VendingMachine = function (products, money, type) {
    let returnChange = [];
    if ((type >= 0) && (type < 5)) {
        if (money > products[type].price) {
            for (let i of change) {
                while (i <= money) {
                    money -= i;
                    returnChange = [...returnChange, i];
                }
                if (money == 0) return {product: products[type].name, change: returnChange};
            }
        } else {
            return "Not enough money for this product";
        }

    } else {
        return "Enter a valid product number";
    }
}