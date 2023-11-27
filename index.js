for (i = 1; i < 101; i++) {
    console.log(function () {
        switch (i % 15) {
            case 0:
                return "FizzBuzz";
            case 3:
            case 6:
            case 9:
            case 12:
                return "Fizz";
            case 5:
            case 10:
                return "Buzz";
            default:
                return i
        }
    }())
}
