

/*
 * Complete the Rectangle function
 */
function Rectangle(a, b) {
    let obj = new Object();
    obj.length = a;
    obj.width = b;
    obj.perimeter = 2 * (a+b);
    obj.area = a * b;
    return obj
}

