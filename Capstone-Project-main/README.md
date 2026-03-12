# Capstone-Project

CS 2334: Programming Structures/Abstractions
Fall 2025 Research 4 All
Problem Statement
ArrayLists and LinkedLists are two of the most fundamental data structures in computer
science. Each offers different trade-offs in terms of memory usage and operation efficiency.
While theory tells us about their time complexity, actual performance in practice depends
on how we implement them and the type of operations we run.
Your task is to investigate:
“Under which circumstances is ArrayList or a LinkedList more efficient in practice?”
Assignment components:
1. Literature Review:
• Each team will be provided with a curated set of articles/resources that explain
theoretical trade-offs between ArrayList and LinkedList.
• As a team, discuss & summarize what the theory says about the relative
performance of the two data structures.
2. Implementation
a) Write your own implementation of:
I. ArrayList<T> (backed by a dynamic array that resizes as needed)
II. Singly LinkedList<T> (with nodes connected by pointers).
Your classes must be implemented using Java generics so they can store elements of
any object type (e.g., ArrayList<Integer>, ArrayList<String>, ArrayList<Double>).
b) Write code to experiment to test the following operations on four data structures:
Your two custom implementations AND the Java API implementations
(java.util.ArrayList and java.util.LinkedList).
I. Sequential access (traversal) – visiting all elements from beginning to end.
II. Random access – retrieving elements by index (e.g., 100 random lookups).
III. Insertions – at the beginning, middle, and end.
IV. Deletions – at the beginning, middle, and end.
For each operation:
I. Run experiments with larger input sizes (e.g., 10k, 50k, 100k, 300k, 500k)
II. Test with at least two different data types (for example: Integer, String, Double)
III. Run each experiment multiple times (at least 10 times) and average the
results for fairness
IV. Record the runtime using System.nanoTime()
V. Plot results in charts/graphs to visualize trends
VI. Run each experiment multiple times (at least 10 times) and average the
results for fairness.
3. Analysis
a) Compare the theoretical expectations with your experimental results.
b) Discuss:
I. When does your ArrayList implementation outperform the
LinkedList?(custom or API)?
II. When does the LinkedList shine?
III. Do the results align with the theory?
IV. What performance differences exist between your custom
implementations and the Java API implementations?
4. Deliverables
I. Code: Submit your full Java implementations & experimental driver programs.
II. Poster: Create a visually clear, creative poster that includes:
• Introduction & motivation (why we care about this comparison).
• Literature review (A summary of theoretical trade-offs from curated readings)
• Methodology (What operations you tested & how)
• Graphs/Charts of your comparative results.
• Key Conclusions: Under what circumstances should one prefer ArrayList vs
LinkedList?
5. Timeline

Week Dates Milestones
Week 1 Oct 6 – Oct 10 Teams formed & review curated readings
Week 2 Oct 13 – Oct 17 Begin implementation of ArrayList & LinkedList
Week 3 Oct 20 – Oct 24 Complete the Java programs for both data structures
Week 4 Oct 27 – Oct 31 Design & run initial experiments
Week 5 Nov 3 – Nov 7 Collect and refine results; create charts
Week 6 Nov 10 – Nov 14 Draft poster content
Week 7 Nov 17 – Nov 21 Finalize poster & code submission
Week 8 Dec 1 – Dec 5 Poster Presentation



CS2334 Final Project: Week 1
This week’s goal is to build a strong understanding of ArrayLists and LinkedLists, as your
final project involves comparing and analyzing these data structures.
➢ As a team, explore and review research articles that discuss the implementation,
performance, and use cases of these two structures.
➢ Be sure to document all the articles you read. A selection of relevant research
papers is also available on Canvas.
➢ If you need assistance with accessing or interpreting any of the readings, please
reach out to your Graduate Research Guide for support.
Your designated Graduate Research Guide (GRG) will be available during your lab hours for
15 minutes per team to assist with your Week 1 tasks.
Team assignments have been released on Canvas, so please check your group details and
coordinate with your teammates accordingly.


CS2334 Final Project: Week 2
This week is all about getting your hands dirty with code! You’ve explored the theory, now
it’s time to bring ArrayLists and LinkedLists to life.
• Start implementing your data structures:
o Create the class skeletons for ArrayList<T> and LinkedList<T>.
o Define core methods: add(), get(), remove(), and size().
• Test small: Begin by inserting a few elements and printing them to verify
correctness.
• Use Generics: Ensure your list classes can store multiple types (e.g., Integer, String).
• Collaborate: Communicate and split work within the team.
• Document progress: Keep short notes on challenges or design choices to include
later in your Methodology section in the poster.
• If you have not yet explored the theory, please review the curated readings this week
in parallel with coding. Understanding the theoretical trade-offs will help you
interpret your experimental results later.
This is your foundation week. A strong implementation now will make your experiments
and analysis smoother in the coming weeks. Test often, debug patiently, and communicate
regularly with your team. Every small success this week builds toward your final poster!
