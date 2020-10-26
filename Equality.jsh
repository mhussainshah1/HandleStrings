StringBuilder one = new StringBuilder();
StringBuilder two = new StringBuilder();
StringBuilder three = one.append("a");
one == two
one == three
one.equals(two)
one.equals(three)
String x = "Hello World";
String z = " Hello World".trim();
x.equals(z)
String string = "a";
StringBuilder builder = new StringBuilder("a");
string == builder