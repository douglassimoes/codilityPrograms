
function solution(A) {
    // write your code in JavaScript (Node.js 4.0.0)
    var counterArray = new Array(A.length).fill(0);
    var sum = 0;
    
    
    for(var i = 0; i < A.length; i++){
        if(A[i] > A.length){
            return 0;    
        }
        if(counterArray[A[i]] === 0){
        counterArray[A[i]] = 1;
        sum += 1;
            }
        }
        
        console.log(counterArray);
        
     if(sum != 0 && sum == A.length-1){
         return 1;
        }  else{
        return 0;
            }
}
