# PasswordValidator
Project to validate password based on set criteria


Tests that a given password provided in say.in file are acceptable and produces an output file say.out conating the result. 

To be acceptable, a password must satisfy these three rules:

It must contain at least one vowel.
It cannot contain three consecutive vowels or three consecutive consonants.
It cannot contain two consecutive occurrences of the same letter, except for 'ee' or 'oo'.
(For the purposes of this problem, the vowels are 'a', 'e', 'i', 'o', and 'u'; all other letters are consonants.) Note that these rules are not perfect; there are many common/pronounceable words that are not acceptable.

The input consists of one or more potential passwords, one per line, followed by a line containing only the word 'end' that signals the end of the file. Each password is at least one and at most twenty letters long and consists only of lowercase letters. For each password, output whether or not it is acceptable, using the precise format shown in the example.

Example input:

a
tv
ptoui
bontres
zoggax
wiinq
eep
houctuh
end


Example output:

<a> is acceptable.
<tv> is not acceptable.
<ptoui> is not acceptable.
<bontres> is not acceptable.
<zoggax> is not acceptable.
<wiinq> is not acceptable.
<eep> is acceptable.
<houctuh> is acceptable.


Running the code:
Pleae run the PasswordValidator class as a starting point for executing the solution from any IDE.

