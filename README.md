# PetBag (JAVA)

Write programs by applying concepts and principles of object-oriented programming. Design and develop custom software for a local pet boarding and grooming business, Pet Boarding and Grooming (Pet BAG). (This is a course project, purpose to familarize myself with gist and github formating and usage).

## UML (provided)

![image of application specification docume. It includes the UML. The UML consist of Class Pet and its instance varables and branches of to the Class dog and the Class Cat and their required variables and methods.](https://user-images.githubusercontent.com/75600338/113311680-8f9d3280-92d7-11eb-94dc-3d7d2c5f72f9.png)

![image of the functionaity requirments for the projecrt for both the pet check in and pet checkout processes to be develoiped.](https://user-images.githubusercontent.com/75600338/113311918-c6734880-92d7-11eb-8b69-e26b1fb57a8d.png)

## Psuedocode (Created, pet check in)

```
START  
    ENTER pet type.  
    IF pet type is equivalent to "dog":
        SET the pet type.
        ENTER the pet name.
        ENTER dog weight.
        ENTER the days stay.
            IF days stay < 1:
                OUTPUT available dates.
                ENTER date.
                Check dog Spaces for date.
                    IF dog space > 1: 
                        SET new dog spaces.
                    ELSE IF dog space < 1:
                        OUTPUT "no spaces available"
                SET date.
                OUTPUT "grooming not available".
            ELSE IF the days stay > 1:
                OUTPUT available dates.
                ENTER date range.
                Check dog Spaces for dates selected.
                    IF dates available:               
                        SET date.
                        IF dog space > 1: 
                            SET date.
                            SET new cat spaces.
                        ELSE IF cat space < 1:
                            OUTPUT " no spaces available"
                            SET new dog spaces.
                        ENTER grooming.
                        IF grooming is TRUE:
                            SET grooming.
                            OUTPUT "grooming selected".
                        ELSE IF grooming is false:
                            OUTPUT "No grooming” 
                    Else IF:
                        OUTPUT "dates not available".
            ELSE IF the days stay < 1:
                OUTPUT "enter valid length of stay".
    ELSE IF pet type is equivalent to "cat":
        SET the pet type.
        ENTER the pet name.
        IF days stay > 0:
                OUTPUT available dates.
                ENTER date.
                Check cat Spaces for date.
                IF cat space > 1: 
                    SET date.
                    EVALUATE and SET new cat spaces.
                ELSE IF cat space < 1:
                    OUTPUT "sorry, no spaces available"
        ELSE IF the days stay < 1:
                OUTPUT "enter valid length of stay".
END
```
 
## Flow-Chart (Created, pet-check in method)

![image of the flowchart created for the pet check in method selected for the project.](https://user-images.githubusercontent.com/75600338/113312274-1f42e100-92d8-11eb-98bd-b69eab285838.png)


