
function solution(X, A) {
    // write your code in JavaScript (Node.js 4.0.0)

    var obj = {};
    obj.step = 1;
    var counterArray = [];
    var result;

        for(var j = 0; j < X+1; j++){
            counterArray[j] = 0;
            }

        for(result = 0; result < A.length; result++){

            counterArray[A[result]] = counterArray[A[result]] + 1;
            if(isPathComplete(counterArray,obj)){
                    return result;
            }
        }

    return -1;
}

function isPathComplete(counterArray,obj){

        for(var i = obj.step; i < X+1; i++){
                if(counterArray[i] == 0){
                        return 0;
                    }
            }
        return 1;
 }
