Create Descriptive Names

Constrained by slow, clunky teletypes, programmers in the past used to contract the names of their variables and routines to save time, keystrokes, ink, and paper. This culture persists in some communities, in the name of backward compatibility; consider C's tongue-twisting wcscspn (wide character string complement span) function. But there's no excuse for this practice in modern code.
Use long descriptive names, like complementSpanLength, to help yourself, now and in the future, as well as your colleagues to understand what the code does. The only exception to this rule concerns the few key variables used within a method's body, such as a loop index, a parameter, an intermediate result, or a return value.
Even more importantly, think long and hard before you name something. Is the name accurate? Did you mean highestPrice, rather than bestPrice? Is the name specific enough to avoid taking more than its fair share of semantic space? Should you name your method getBestPrice, rather than getBest? Does its form match that of other similar names? If you have a method ReadEventLog, you shouldn't name another NetErrorLogRead. If you're naming a function, does the name describe what the function returns?
Finally, there are some easy naming rules. Class and type names should be nouns. Methods names should contain a verb. In particular, if a method returns a value indicating whether something holds true for an object, the method name should start with is. Other methods that return an object's property should start with get, and those that set a property should start with set.

Bad Example : 
```
	public void setdist(int distance){
		this.distance = distance;
	}
```
Good Example : 
```
	public void setDistance(int distance){
		this.distance = distance;
	}
```
Source : http://www.informit.com/articles/article.aspx?p=2223710

-------------------------------------------------------------------------------------------------------------------

Split Your Code into Short, Focused Units

Every method, function, or logical code block should fit on a reasonably-sized screen window (25–50 lines long). If it's longer, split it into shorter pieces. An exception can be made for simple repetitive code sequences. However, in such cases, consider whether you could drive that code through a data table. Even within a routine, divide long code sequences into blocks whose function you can describe with a comment at the beginning of each block.
Furthermore, each class, module, file, or process should concern one single thing. If a code unit undertakes diverse responsibilities, split it accordingly.


Bad Example : 
```
	public static void ListOddNumber(int limit) {
		int i = 0;
		while (true) {
			i++;
			if (i < limit) {
				if (i % 2 != 0) {
					System.out.print(i + " ");
				}
			} else {
				break;
			}
		}
	}
```
Good Example : 
```
	public static void ListOddNumber(int limit) {
		for (int i = 1; i < limit; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
```
Source : http://www.informit.com/articles/article.aspx?p=2223710