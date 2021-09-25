# GenericsTiposCuringa
# Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer tipo":

## Generics são invariantes


### List<Object> não é o supertipo de qualquer tipo de lista: 
  
```java
List<Object> myObjs = new ArrayList<Object>();
List<Integer> myNumbers = new ArrayList<Integer>();
myObjs = myNumbers; // erro de compilação
```
### O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:

```java
List<?> myObjs = new ArrayList<Object>();
List<Integer> myNumbers = new ArrayList<Integer>();
myObjs = myNumbers;
```
Porém não é possível adicionar dados a uma coleção de tipo curinga
  
```java
package application;
import java.util.ArrayList;
import java.util.List;
public class Program {
    public static void main(String[] args) {
        List<?> list = new ArrayList<Integer>();
        list.add(3); // erro de compilação
    }
}
```
O compilador não sabe qual é o tipo específico do qual a lista foi instanciada.
