# assignment02-system-specification-ondemand
1. What to do?
Create a system specification for your project according to

the syp-book, and

the syp-template

2. How to do?
2.1. Check out the project of gh-classroom (link is available separately)
For each team, one repo is sufficient
2.2. Add the asciidoctor stuff to the repo
Download the latest release into your repo.

Extract docs-as-code.zip in the repo-root

Rename asciidocs.demo/syspec.adoc to system-specification.adoc.

Copy asciidocs.demo/system-specification.adoc to asciidocs/system-specification.adoc.

Delete the file docs-as-code.zip

Delete the macos-stuff

rm -rf __MACOSX
rm .DS_Store
2.3. Add your github-data
rename the .env.template-file to .env.

fill in your gh-username and gh-email

GIT_GLOBAL_MAIL=<your git-email>
GIT_GLOBAL_USER_NAME=<your git-username>
Notice, that this file is included in .gitignore. Each team member can fill in his/her personal data.
2.4. Create a new index.adoc
Add the data (title, …​) of your project
= My Project
firstname lastname
1.0.0, yyyy-mm-dd: Some notes
:sourcedir: ../src/main/java
:icons: font
:sectnums:    // Nummerierung der Überschriften / section numbering
:toc: left

== Project Description

// Short Desciption of your Project

== Team

// <catalog-number><first letter of lastname><first letter of first name>
// ie

* 01BA
* 12XY
* 24DF

== Documents

* <<project-proposal.adoc#, Project Proposal>> (Projektantrag)
* <<project-oder.adoc#, Project Order>> (Projektauftrag)
* <<system-specification.adoc#, System Specification>> (Pflichtenheft)

== External Project Repository

// when an external git-repo exists, include the url here
2.5. Copy the existing docs to the new repo
project proposal (Projektantrag) → project-proposal.adoc

project order (Projectauftrag) → project-oder.adoc

2.6. Add the System Specification
Copy system-specification.adoc from asciidoctor.demo

2.7. Remove the folder asciidocs.demo
Your repo should look like:

.
├── .env
├── .gitignore
├── README.md
├── asciidocs
│   ├── .nojekyll
│   ├── docinfo.html
│   ├── images
│   │   └── .keep
│   ├── index.adoc
│   ├── project-order.adoc
│   ├── project-proposal.adoc
│   ├── system-specification.adoc
│   └── themes
│       ├── favicon.ico
│       └── favicon.png
├── build-html-docker-inside-docker.sh
├── docs-as-code.zip
├── publish-gh-pages-inside-docker.sh
└── run-inside-docker.sh
2.8. Complete the System Specification
Make a commit for each chapter

2.9. Create the gh-pages
2.10. Complete the README.md
Don’t forget the link to the gh-page(s)
3. Attention should be paid to …​
Do not fork old repos (there should be a clean history)

Commit (at least) each chapter of your sys-spec.

Every team member is supposed to write a chapter an commit his/her work.
