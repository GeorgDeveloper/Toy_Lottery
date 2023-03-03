# Toy_Lottery
## Программа – розыгрыша призов

### Запуск программы

>*** Программа 'Розыгрыш призов' ***
> 
> Меню команд программы:
> 
> *RUN* - Запуск программы. 
> 
> *LISTPRIZES* - Вывести список призов прошлого розыгрыша.
> 
> *CREATETOY* - Создать список призов для розыгрыша. 
> 
> *CLEAR* - Очистить список выданных призов.
> 
> *EXIT* - Завершить и выти

При первом запуске необходимо запустить создание перечня призов с 
помощью команды *CREATETOY*.

Далее запустить розыгрыш командой *RUN* и 
задать количество призов и участников розыгрыша.

Рандомному участнику выпадает рандомный приз, при учете отсутствия нулевого веса 
у приза. Вес приза также задается рандомно.

По окончании выводится итоги розыгрыша и меню обработки результата:
>*ISSUE* - Показать не разыгранные призы
> 
>*COMPLETE* - Выдать все призы
> 
>*EXIT* - Выйти из меню

Результаты розыгрыша записываются в файл - *BD_WINNER.csv*

Наименование призов записываются в файл - *BD_Name_Toy.csv*


## Prize drawing program

### Running the program

>*** The 'Prize Draw' program ***
>
> Program command menu:
>
> *RUN* - Start the program.
>
> *LISTPRIZES* - Display a list of prizes from the previous draw.
>
> *CREATETOY* - Create a list of prizes for the drawing.
>
> *CLEAR* - Clear the list of prizes awarded.
>
> *> *EXIT* - Finish and exit

At the first launch, you need to start creating a list of prizes
using the *CREATE TOYS* command.

Next, run the draw with the *RUN* command and
set the number of prizes and participants of the draw.

A random participant gets a random prize, taking into account the absence of zero weight
in the prize. The prize weight is also set randomly.

At the end, the results of the draw and the result processing menu are displayed:
>*>*ISSUE* - Show undrafted prizes
>
>*COMPLETE* - Give out all prizes
>
>*EXIT* - Exit the menu

The results of the drawing are recorded in the file - *BD_WINNER.csv*

The names of the prizes are recorded in the file - *BD_Name_Toy.csv*
