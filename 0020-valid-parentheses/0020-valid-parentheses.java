class Solution {
  public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();

    for (char c : s.toCharArray()) {
      if (isOpenBracket(c)) {
        stack.push(getClosingBracket(c));
      } else if (isClosingBracket(c)) {
        if (stack.isEmpty() || stack.pop() != c) {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }

  private boolean isOpenBracket(char c) {
    return c == '(' || c == '{' || c == '[';
  }

  private boolean isClosingBracket(char c) {
    return c == ')' || c == '}' || c == ']';
  }

  private char getClosingBracket(char openBracket) {
    switch (openBracket) {
      case '(':
        return ')';
      case '{':
        return '}';
      case '[':
        return ']';
      default:
        throw new IllegalArgumentException("Invalid bracket: " + openBracket);
    }
  }
}