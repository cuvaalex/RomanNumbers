Meta:

Narrative:
In order to know the conversion between Arabic number and Roman number
As a bookeeper
I want a converter solution

Scenario: simple numbers
Given I have a simple <number>
When I press convert to Roman
Then I get <roman>
Examples:
|number|roman|
|1|I|
|2|II|
|3|III|
|4|IV|
|5|V|
|6|VI|
|7|VII|
|8|VIII|
|9|IX|
|10|X|
|50|L|
|100|C|
|500|D|
|1000|M|

Scenario: complex numbers
Given I have a simple <number>
When I press convert to Roman
Then I get <roman>
Examples:
|number|roman|
|900|CM|
|400|CD|
|90|XC
|40|XL|
|999|CMXCIX|
|99|XCIX|
|449|CDXLIX|
|448|CDXLVIII|

