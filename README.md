# BANKER
A very simple **Core Java** project that allows to create and manage multiple banks. You can create banks, add customers and conduct bank transactions.

## Technologies
![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.6%2B-blue?logo=apachemaven&logoColor=white)

## Prerequisites
- Java 17+
- Maven

## Installation (Will work on both powershell and bash/zsh terminals)
1. Clone the repository:
   ```bash
   git clone https://github.com/ZeleOeO/Banker.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Banker
   ```   
3. Build the project:
   ```bash
   mvn clean install
   ```
4. Run the project:
   ```bash
   mvn exec:java -Dexec.mainClass="com.zele.Main"
   ```
   
## Usage
I can't remember how to handle it, poke around in the `Main.java` and figure it out.

## Running Tests
To run tests run:
```bash
mvn test
```

## File Structure
```powershell
src/
 ├── main/
 │   ├── java/
 │   │   └── com/zele/
 │   │       │   entities/
 │   │       │   exceptions/
 │   │       │   tools/
 │   │       └── Main.java
 │   └── resources/
 └── test/
     ├── java/
     │   └── com/zele/
     │       ├── entities
     │       └── tools

```


## Steps to Contribute
Contributions are more than welcome as I've abandoned this project (I don't care about it lk)
1. Open an issue first so I can like keep track, but if that's too much stress that's fine too
2. Fork the Repository
3. Clone your fork
4. Create a new branch
   ```bash
   git checkout -b your-branch-name
   ```
5. Make your change
6. Commit your change, please use [Conventional Commits](https://gist.github.com/qoomon/5dfcdf8eec66a051ecd85625518cfd13) if you can, I didn't really use it here tbh
7. Push your change
8. Make a pull request and reference your issue <br>
   Please stick to conventional methods of programming java and springboot applications, don't mess up my already spaghetti code

## License
[MIT](https://choosealicense.com/licenses/mit/)
