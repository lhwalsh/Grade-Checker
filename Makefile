ADDFILES = main.java fileManager.java gradeTracker.java Makefile

default : fileManager.class gradeTracker.class main.class
	@echo Compilation finished.

fileManager.class : fileManager.java
	@echo -n Compiling fileManager.java...
	@javac fileManager.java
	@echo done

gradeTracker.class : gradeTracker.java
	@echo -n Compliing gradeTracker.java...
	@javac gradeTracker.java
	@echo done

main.class : main.java
	@echo -n Compiling main.java...
	@javac main.java
	@echo done

add :
	@$(MAKE) -s clean
	@echo -n Adding files...
	@git add $(ADDFILES)
	@echo done

clean :
	@echo -n Cleaning...
	@rm -rf *.class
	@echo done
