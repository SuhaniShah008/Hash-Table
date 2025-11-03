class StringWrapper {
    
    private String data;
    /* 
     * pre:
     * post: data is set to the given string.
     */
     //Sets data to the given string 
    public StringWrapper(String data) {
        this.data = data;
    }
    
     /* 
     * pre: 
     * post: Returns the original string stored in 'data'. 
     */
    //Used for getting the original string that was stored into data
    public String getData() {
        return data;
    }
    
    /* 
     * pre: data is not null. 
     * post: Returns an integer hash code that is the last digit of the product of vowel count and total length
     */
     //Checks the number of vowels and total length of string to multiply and find last digit of value
    @Override
    public int hashCode() {
        int vowelCount = 0;
        for (char c : data.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowelCount++;
            }
        }
        int totalChars = data.length();
        int product = vowelCount * totalChars;
        return product % 10; // Return last digit
    }
    
     /* 
     * pre: obj is any object (can be null). 
     * post: Returns true if obj is a StringWrapper with the same data, false otherwise
     */
     //Checks if StringWrapper is the same as obj's data 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StringWrapper that = (StringWrapper) obj;
        return data.equals(that.data);
    }
    
    /* 
     * pre:
     * post: Returns the string stored in 'data'
     */
     //Used for returning the string that is inside of data
    @Override
    public String toString() {
        return data;
    }
}