// Correctness and Performance 100%

function solution(A) {
    // write your code in JavaScript (Node.js 4.0.0)
    var counterArray = new Array(A.length).fill(0);


    for(var i = 0; i < A.length; i++){
        if(A[i] > A.length){
            return 0;
        }
        counterArray[A[i]-1] += 1;
    }

        
    for(var i = 0; i < counterArray.length; i++){
        if(counterArray[i] === 0 || counterArray[i] > 1){
            return 0;
        }
    }
    
    return 1;
}
