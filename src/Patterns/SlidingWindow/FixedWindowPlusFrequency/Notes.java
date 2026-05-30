package Patterns.SlidingWindow.FixedWindowPlusFrequency;

/*Mental Model
Step 1

Pattern:

abc

Frequency array:

a -> 1
b -> 1
c -> 1

Meaning:

I still need:
1 a
1 b
1 c
Step 2

Incoming character enters window

if(freq[incoming - 'a'] > 0)
{
    count--;
}

freq[incoming - 'a']--;

Meaning:

Character arrived.
Consume its requirement.
Step 3

Outgoing character leaves window

if(freq[outgoing - 'a'] >= 0)
{
    count++;
}

freq[outgoing - 'a']++;

Meaning:

Character left.
Need it again.
Restore requirement.
Fixed Window + Frequency Template

For many interview problems, remember this template:

1. Build frequency map/array

2. Expand window
   -> process incoming character

3. Window size reached K
   -> check answer

4. Process outgoing character

5. Slide window

This exact pattern is reused in:

Find All Anagrams in a String
Permutation in String
Count Occurrences of Anagrams
Count Distinct Elements in Every Window
Substrings of Size K with Distinct Characters
Maximum Sum of Distinct Subarrays of Length K*/

public record Notes() {


}
