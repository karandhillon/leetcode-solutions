class Solution {
  public String minRemoveToMakeValid(String s) {
    char[] sArr = s.toCharArray();
    
    int openBracketsCount = 0;
    
    for (int i = 0; i < sArr.length; i++) {
      if (sArr[i] == '(') {
        openBracketsCount++;
      } else if (sArr[i] == ')') {
        if (openBracketsCount > 0) {
          openBracketsCount--;
        } else {
          sArr[i] = '*';
        }
      }
    }
    
    for (int i = sArr.length - 1; i >= 0; i--) {
      if (openBracketsCount == 0) {
        break;
      }
      
      if (sArr[i] == '(') {
        sArr[i] = '*';
        openBracketsCount--;
      }
    }
    
    StringBuilder strBld = new StringBuilder();
    for (int i = 0; i < sArr.length; i++) {
      if (sArr[i] != '*') {
        strBld.append(sArr[i]);
      }
    }
    
    return strBld.toString();
  }
}
