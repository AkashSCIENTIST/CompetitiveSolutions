
/*
 * Create the function factorial here
 */
function factorial(n){
    n = parseInt(n);
    var f = 1;
    for(var i=1; i<=n; i++){
        f *= i;
    }
    return f;
}

