package main.java;

class VarArgsAdd {
    // Solution
    void add(int ... numbers){
        int sum = 0;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            result.append(numbers[i]);
            if(i < numbers.length -1){
                result.append("+");
            }
        }
        result.append("=").append(sum);
        System.out.println(result);
    }
}
