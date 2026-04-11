<div class="html-chunk">

    <h2><span>Basics of MongoDB </span></h2>
    <p dir="ltr"><span>Before proceeding towards the </span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-tutorial/" target="_blank" rel="noopener"><span>MongoDB
            </span></a><span>cheat sheet let's have a quick look on MongoDB basic. </span></p>
    <table>
        <thead></thead>
        <tbody>
            <tr>
                <td>
                    <p dir="ltr"><b><strong>What is MongoDB</strong></b></p>
                </td>
                <td>
                    <p dir="ltr"><span>MongoDB is a document-oriented </span><b><strong>NoSQL
                                database</strong></b><span> that stores data in flexible, </span><a
                            href="https://www.geeksforgeeks.org/javascript/javascript-json/" target="_blank"
                            rel="noopener"><b><strong>JSON</strong></b></a><b><strong>-like</strong></b><span>
                            documents.</span></p>
                </td>
            </tr>
            <tr>
                <td>
                    <p dir="ltr"><b><strong>DataTypes in MongoDB</strong></b></p>
                </td>
                <td>
                    <p dir="ltr"><a href="https://www.geeksforgeeks.org/mongodb/mongodb-tutorial/" target="_blank"
                            rel="noopener"><span>MongoDB</span></a><span> supports various data types including string,
                            integer, double, boolean, arrays, objects, dates, and null.</span></p>
                </td>
            </tr>
            <tr>
                <td>
                    <p dir="ltr"><b><strong>What is ObjectId in MongoDB</strong></b></p>
                </td>
                <td>
                    <p dir="ltr"><span>ObjectId is a 12-byte </span><b><strong>hexadecimal</strong></b><span> number
                            that uniquely identifies documents in a collection.</span></p>
                </td>
            </tr>
            <tr>
                <td>
                    <p dir="ltr"><b><strong>MongoDB Atlas</strong></b></p>
                </td>
                <td>
                    <p dir="ltr"><span>MongoDB Atlas is a fully managed cloud database service. It provides automated
                            backups, monitoring, and security features.</span></p>
                </td>
            </tr>
            <tr>
                <td>
                    <p dir="ltr"><b><strong>MongoDB Compass</strong></b></p>
                </td>
                <td>
                    <p dir="ltr"><a href="https://www.geeksforgeeks.org/mongodb/mongodb-compass/" target="_blank"
                            rel="noopener"><span>MongoDB Compass</span></a><span> is a graphical user interface for
                        </span><b><strong>MongoDB</strong></b><span>. It allows users to visualize data, run queries,
                            and analyze performance.</span></p>
                </td>
            </tr>
            <tr>
                <td>
                    <p dir="ltr"><b><strong>What is MongoDB Shell</strong></b></p>
                </td>
                <td>
                    <p dir="ltr"><a href="https://www.geeksforgeeks.org/mongodb/mongodb-shell/" target="_blank"
                            rel="noopener"><span>MongoDB Shell</span></a><span> is a </span><b><strong>command-line
                                interface</strong></b><span> for interacting with MongoDB instances. It allows users to
                            execute queries, perform administrative tasks, and manage </span><a
                            href="https://www.geeksforgeeks.org/dbms/what-is-database/" target="_blank"
                            rel="noopener"><span>databases</span></a><span>.</span></p>
                </td>
            </tr>
        </tbody>
    </table>
    <h2><span>CRUD Operations in MongoDB</span></h2>
    <p dir="ltr"><span>This section covers the basics of working with your MongoDB database using </span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-crud-operations/" target="_blank"
            rel="noopener"><span>CRUD operations</span></a><span>. You'll learn how to
        </span><b><strong>Create</strong></b><span>, </span><b><strong>Read</strong></b><span>,
        </span><b><strong>Update</strong></b><span>, and </span><b><strong>Delete </strong></b><span>documents which
            allowing us to efficiently manage your data. Get ready to add, retrieve, modify, and remove information
            easily</span></p>
    <h3><span>Connect to MongoDB</span></h3>
    <pre><span>mongo</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Open a terminal and start the </span><b><strong>MongoDB shell
            </strong></b><span>by typing mongo.</span></p>
    <h3><span>Create and Use a Database</span></h3>
    <pre><span>use blog</span></pre>
    <p dir="ltr" style="text-align: justify;"><span> Create (if not exists) and use the
            '</span><b><strong>blog</strong></b><span>' database</span></p>
    <h3><span>Create Collections</span></h3>
    <pre><span>// Create a 'posts' collection</span><br><span>db.createCollection("posts")</span><br><br><span>// Create a 'users' collection</span><br><span>db.createCollection("users")</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Create two collections: posts for storing blog posts and users for
            storing user information.</span></p>
    <h3><span>Insert Operations</span></h3>
    <p dir="ltr" style="text-align: justify;"><span>Insert a single document into
            '</span><b><strong>posts</strong></b><span>' collection</span></p>
    <pre><br><span>db.posts.insertOne({</span><br><span>    title: "Introduction to MongoDB",</span><br><span>    content: "MongoDB is a NoSQL database.",</span><br><span>    author: "John Doe",</span><br><span>    tags: ["mongodb", "nosql", "database"]</span><br><span>})</span><br></pre>
    <p dir="ltr" style="text-align: justify;"><span>Insert multiple documents into
            '</span><b><strong>users</strong></b><span>' collection</span></p>
    <pre><span>db.users.insertMany([</span><br><span>    {</span><br><span>        username: "johndoe",</span><br><span>        email: "johndoe@example.com",</span><br><span>        age: 30</span><br><span>    },</span><br><span>    {</span><br><span>        username: "janedoe",</span><br><span>        email: "janedoe@example.com",</span><br><span>        age: 28</span><br><span>    }</span><br><span>])</span></pre>
    <h3><span>Update Operations</span></h3>
    <p dir="ltr" style="text-align: justify;"><span>Update a document in '</span><b><strong>users</strong></b><span>'
            collection</span></p>
    <pre><span>db.users.updateOne(</span><br><span>    { username: "johndoe" },</span><br><span>    { $set: { age: 31 } }</span><br><span>)</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Update multiple documents in 'posts' collection</span></p>
    <pre><span>db.posts.updateMany(</span><br><span>    { tags: "mongodb" },</span><br><span>    { $addToSet: { tags: "database" } }</span><br><span>)</span></pre>
    <h3><span>Delete Operations</span></h3>
    <p dir="ltr" style="text-align: justify;"><span>Delete a document from '</span><b><strong>users</strong></b><span>'
            collection</span></p>
    <pre><span>db.users.deleteOne({ username: "janedoe" })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Delete multiple documents from
            '</span><b><strong>posts</strong></b><span>' collection</span></p>
    <pre><span>db.posts.deleteMany({ author: "John Doe" })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Drop the entire 'users' collection</span></p>
    <pre><span>db.users.drop()</span></pre>
    <h3><span>Query Operations</span></h3>
    <p dir="ltr" style="text-align: justify;"><span>Find all documents in '</span><b><strong>posts</strong></b><span>'
            collection</span></p>
    <pre><span>db.posts.find()</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Find one document in '</span><b><strong>posts</strong></b><span>'
            collection</span></p>
    <pre><span>db.posts.findOne({ title: "Introduction to MongoDB" })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Find and modify a document in 'posts' collection</span></p>
    <pre><span>db.posts.findOneAndUpdate(</span><br><span>    { title: "Introduction to MongoDB" },</span><br><span>    { $set: { content: "MongoDB is a flexible and scalable NoSQL database." } }</span><br><span>)</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Find one and delete a document in
            '</span><b><strong>posts</strong></b><span>' collection</span></p>
    <pre><span>db.posts.findOneAndDelete({ author: "John Doe" })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Find one and replace a document in
            '</span><b><strong>posts</strong></b><span>' collection</span></p>
    <pre><span>db.posts.findOneAndReplace(</span><br><span>    { title: "Introduction to MongoDB" },</span><br><span>    { title: "MongoDB Overview", content: "A detailed guide to MongoDB." }</span><br><span>)</span></pre>
    <h3><span>Query with Projections</span></h3>
    <p dir="ltr" style="text-align: justify;"><span>Find documents with projection (only return 'title' and 'author'
            fields)</span></p>
    <pre><span>db.posts.find({}, { title: 1, author: 1 })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Query nested documents (e.g., find users with email ending in
            '.com')</span></p>
    <pre><span>db.users.find({ "email": /.*\.com$/ })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Query documents with null or missing fields</span></p>
    <pre><span>db.users.find({ email: null })</span></pre>
    <h3><span>Show Database Information</span></h3>
    <pre><span>// Show available databases</span><br><span>show dbs</span><br><br><span>// Show collections in the current database</span><br><span>show collections</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>To see a list of available databases and their collections</span>
    </p>
    <h2><span>MongoDB Operators</span></h2>
    <p dir="ltr"><b><strong>MongoDB operators </strong></b><span>are like tools that help you work with your data
            effectively. They allow you to find specific information, make changes and analyze your data in MongoDB.
        </span></p>
    <p dir="ltr"><span>Mastering these operators gives you the ability to manage and explore your data more efficiently,
            uncovering valuable insights along the way.</span></p>
    <h3><span>1. Comparison Operators</span></h3>
    <p dir="ltr" style="text-align: justify;"><span>Find documents where age is greater than 30 in 'users'
            collection</span></p>
    <pre><span>db.users.find({ age: { $gt: 30 } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Find documents where age is less than or equal to 28 in 'users'
            collection</span></p>
    <pre><span>db.users.find({ age: { $lte: 28 } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Find documents where title is equal to "MongoDB Overview" in 'posts'
            collection</span></p>
    <pre><span>db.posts.find({ title: { $eq: "MongoDB Overview" } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Find documents where age is not equal to 30 in 'users'
            collection</span></p>
    <pre><span>db.users.find({ age: { $ne: 30 } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>In these queries, we utilize the
        </span><b><strong>$gt</strong></b><span> (</span><b><strong>greater than</strong></b><span>),</span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-less-than-operator-lt/" target="_blank"
            rel="noopener"><b><strong> $lt</strong></b><span> </span></a><span>(</span><b><strong>less
                than</strong></b><span>), and </span><b><strong>$eq</strong></b><span>
            (</span><b><strong>equality</strong></b><span>) comparison operators to filter documents based on specific
            criteria. Additionally, we demonstrate the $ne (not equal) operator to find documents where a field does not
            match a specified value.</span></p>
    <h3><span>2. Logical Operators</span></h3>
    <p dir="ltr" style="text-align: justify;"><span>Find documents where age is greater than 25 </span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-and-operator-and/" target="_blank"
            rel="noopener"><span>AND </span></a><span>less than 35 in 'users' collection</span></p>
    <pre><span>db.users.find({ $and: [ { age: { $gt: 25 } }, { age: { $lt: 35 } } ] })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Find documents where username is "johndoe" </span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-or-operator-or/" target="_blank" rel="noopener"><span>OR
            </span></a><span>email is "janedoe@example.com" in 'users' collection</span></p>
    <pre><span>db.users.find({ $or: [ { username: "johndoe" }, { email: "janedoe@example.com" } ] })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Find documents where age is </span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-not-operator-not/" target="_blank"
            rel="noopener"><span>NOT </span></a><span>equal to 30 in 'users' collection</span></p>
    <pre><span>db.users.find({ age: { $not: { $eq: 30 } } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Find documents where age is neither 30 nor 31 in 'users'
            collection</span></p>
    <pre><span>db.users.find({ age: { $nor: [ { $eq: 30 }, { $eq: 31 } ] } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>We use the $and operator to find documents where multiple conditions
            must be satisfied simultaneously. The $or operator is utilized to find documents where at least one of the
            specified conditions is met. Using the $not operator, we exclude documents where a specific condition is
            true. The $nor operator is used to find documents where none of the specified conditions are met.</span></p>
    <h3><span>3. Arithmetic Operators</span></h3>
    <p dir="ltr" style="text-align: justify;"><span>Let's </span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-add-operator/" target="_blank"
            rel="noopener"><span>Add</span></a><span> 5 to the age of all users in 'users' collection</span></p>
    <pre><span>db.users.updateMany({}, { $add: { age: 5 } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's </span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-subtract-operator/" target="_blank"
            rel="noopener"><span>Subtract </span></a><span>2 from the age of users aged 30 in 'users' collection</span>
    </p>
    <pre><span>db.users.updateMany({ age: 30 }, { $subtract: { age: 2 } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's </span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-multiply-operator/" target="_blank"
            rel="noopener"><span>Multiply </span></a><span>the age of users by 2 in 'users' collection</span></p>
    <pre><span>db.users.updateMany({}, { $multiply: { age: 2 } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's </span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-divide-operator/" target="_blank"
            rel="noopener"><span>Divide </span></a><span>the age of all users by 2 in 'users' collection</span></p>
    <pre><span>db.users.updateMany({}, { $divide: { age: 2 } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Calculate the</span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-abs-operator/" target="_blank" rel="noopener"><span>
                absolute value</span></a><span> of the age of all users in 'users' collection</span></p>
    <pre><span>db.users.updateMany({}, { $abs: { age: true } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>We use the $add, $subtract, $multiply, and $divide operators to
            perform addition, subtraction, multiplication, and division respectively on numeric fields. The $abs
            operator calculates the absolute value of numeric fields.</span></p>
    <h3><span>4. Field Update Operators</span></h3>
    <p dir="ltr" style="text-align: justify;"><span>Let's Update the age of users to the maximum value of 40 in 'users'
            collection</span></p>
    <pre><span>db.users.updateMany({}, { $max: { age: 40 } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Update the age of users to the minimum value of 20 in 'users'
            collection</span></p>
    <pre><span>db.users.updateMany({}, { $min: { age: 20 } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Increment the age of users by 1 in 'users' collection</span>
    </p>
    <pre><span>db.users.updateMany({}, { $inc: { age: 1 } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Multiply the age of users by 1.1 in 'users' collection</span>
    </p>
    <pre><span>db.users.updateMany({}, { $mul: { age: 1.1 } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>We use the </span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-maximum-operator-max/" target="_blank"
            rel="noopener"><span>$max</span></a><span> and </span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-minimum-operator-min/" target="_blank"
            rel="noopener"><span>$min</span></a><span> operators to update fields to the maximum or minimum value
            respectively. The $inc operator increments numeric fields by a specified value. The</span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-multiply-operator-mul/" target="_blank"
            rel="noopener"><span> $mul</span></a><span> operator multiplies numeric fields by a specified value.</span>
    </p>
    <h3><span>5. Array Expression Operators</span></h3>
    <p dir="ltr" style="text-align: justify;"><span>Let's Find documents where 'tags' field is an array in 'posts'
            collection</span></p>
    <pre><span>db.posts.find({ tags: { $isArray: true } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Find documents in 'posts' collection where the size of the
            'tags' array is 3</span></p>
    <pre><span>db.posts.find({ $expr: { $eq: [{ $size: "$tags" }, 3] } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Find the first element of the 'tags' array in each document of
            'posts' collection</span></p>
    <pre><span>db.posts.aggregate([</span><br><span>    { $project: { firstTag: { $arrayElemAt: ["$tags", 0] } } }</span><br><span>])</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Concatenate the 'tags' arrays of all documents in 'posts'
            collection</span></p>
    <pre><span>db.posts.aggregate([</span><br><span>    { $group: { _id: null, allTags: { $concatArrays: "$tags" } } }</span><br><span>])</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Reverse the 'tags' array in all documents of 'posts'
            collection</span></p>
    <pre><span>db.posts.updateMany({}, { $reverseArray: "$tags" })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>We use the </span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-isarray-operator/" target="_blank"
            rel="noopener"><span>$isArray</span></a><span> operator to find documents where a field is an array. The
            $size operator is used to find documents based on the size of an array field. With </span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-arrayelemat-operator/" target="_blank"
            rel="noopener"><span>$arrayElemAt</span></a><span>, we retrieve a specific element from an array field. The
            $concatArrays operator concatenates arrays. Finally,</span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-reversearray-operator/" target="_blank"
            rel="noopener"><span> $reverseArray</span></a><span> reverses the elements of an array.</span></p>
    <h3><span>6. Array Update Operators</span></h3>
    <p dir="ltr" style="text-align: justify;"><span>Let's Remove all occurrences of
            "</span><b><strong>mongodb</strong></b><span>" from the 'tags' array in 'posts' collection</span></p>
    <pre><span>db.posts.updateMany({}, { $pull: { tags: "mongodb" } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Remove the last element from the
            '</span><b><strong>tags</strong></b><span>' array in all documents of
            '</span><b><strong>posts</strong></b><span>' collection</span></p>
    <pre><span>db.posts.updateMany({}, { $pop: { tags: 1 } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Remove all occurrences of
            "</span><b><strong>nosql</strong></b><span>" and "database" from the
            '</span><b><strong>tags</strong></b><span>' array in '</span><b><strong>posts</strong></b><span>'
            collection</span></p>
    <pre><span>db.posts.updateMany({}, { $pullAll: { tags: ["nosql", "database"] } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Add "</span><b><strong>newtag</strong></b><span>" to the end
            of the '</span><b><strong>tags</strong></b><span>' array in a specific document in
            '</span><b><strong>posts</strong></b><span>' collection</span></p>
    <pre><span>db.posts.updateOne({ title: "Introduction to MongoDB" }, { $push: { tags: "newtag" } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Update the '</span><b><strong>tags</strong></b><span>' array
            in all documents where "</span><b><strong>mongodb</strong></b><span>" is present with
            "</span><b><strong>updatedtag</strong></b><span>"</span></p>
    <pre><span>db.posts.updateMany({ tags: "mongodb" }, { $set: { "tags.$": "updatedtag" } })</span></pre>
    <h3><span>7. String Expression Operators</span></h3>
    <p dir="ltr" style="text-align: justify;"><span>Concatenate the 'title' and 'content' fields into a new field
            '</span><b><strong>fullText</strong></b><span>' in 'posts' collection</span></p>
    <pre><span>db.posts.aggregate([</span><br><span>    {</span><br><span>        $project: {</span><br><span>            fullText: { $concat: ["$title", " ", "$content"] }</span><br><span>        }</span><br><span>    }</span><br><span>])</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Compare the 'title' field case insensitively to
            "</span><b><strong>MongoDB</strong></b><span>" in 'posts' collection</span></p>
    <pre><span>db.posts.find({ $expr: { $eq: [{ $strcasecmp: ["$title", "MongoDB"] }, 0] } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Convert the '</span><b><strong>title</strong></b><span>' field
            to </span><b><strong>uppercase</strong></b><span> in 'posts' collection</span></p>
    <pre><span>db.posts.updateMany({}, { $set: { title: { $toUpper: "$title" } } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Convert the '</span><b><strong>title</strong></b><span>' field
            to </span><b><strong>lowercase </strong></b><span>in 'posts' collection</span></p>
    <pre><span>db.posts.updateMany({}, { $set: { title: { $toLower: "$title" } } })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Extract the first 5 characters from the
            '</span><b><strong>title</strong></b><span>' field in 'posts' collection</span></p>
    <pre><span>db.posts.aggregate([</span><br><span>    { $project: { firstFiveChars: { $substrCP: ["$title", 0, 5] } } }</span><br><span>])</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>We use the</span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-concat-operator/" target="_blank"
            rel="noopener"><b><strong> $concat </strong></b></a><span>operator to concatenate fields or
            strings.</span><a href="https://www.geeksforgeeks.org/mongodb/mongodb-strcasecmp-operator/" target="_blank"
            rel="noopener"><b><strong> $strcasecmp</strong></b></a><span> compares strings case insensitive.
            The</span><a href="https://www.geeksforgeeks.org/mongodb/mongodb-toupper-operator/" target="_blank"
            rel="noopener"><b><strong> $toUpper</strong></b></a><span> operator converts a string to uppercase. $toLower
            converts a string to lowercase. </span><a
            href="https://www.geeksforgeeks.org/mongodb/substrcp-aggregation-operator-in-mongodb/" target="_blank"
            rel="noopener"><b><strong>$substrCP</strong></b></a><span> extracts a substring from a string based on code
            points.</span></p>
    <h2><span>MongoDB Aggregation Framework</span></h2>
    <p dir="ltr" style="text-align: justify;"><span>We'll perform various </span><a
            href="https://www.geeksforgeeks.org/mongodb/aggregation-in-mongodb/" target="_blank"
            rel="noopener"><b><strong>aggregation</strong></b></a><span> operations using MongoDB's aggregation
            framework</span></p>
    <p dir="ltr" style="text-align: justify;"><span>Let's Update documents with aggregation pipeline: multiply
            '</span><b><strong>age</strong></b><span>' field by 2 and store in
            '</span><b><strong>doubleAge</strong></b><span>' field</span></p>
    <pre><span>db.users.aggregate([</span><br><span>    { $addFields: { doubleAge: { $multiply: ["$age", 2] } } },</span><br><span>    { $out: "users" }</span><br><span>])</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Count the number of documents in 'users' collection</span></p>
    <pre><span>db.users.aggregate([</span><br><span>    { $count: "total_users" }</span><br><span>])</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Group documents in 'users' collection by 'age' and calculate
            the count in each group</span></p>
    <pre><span>db.users.aggregate([</span><br><span>    { $group: { _id: "$age", count: { $sum: 1 } } }</span><br><span>])</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Perform a left outer join between 'posts' and 'users'
            collections based on 'author' field</span></p>
    <pre><span>db.posts.aggregate([</span><br><span>    {</span><br><span>        $lookup: {</span><br><span>            from: "users",</span><br><span>            localField: "author",</span><br><span>            foreignField: "username",</span><br><span>            as: "author_info"</span><br><span>        }</span><br><span>    }</span><br><span>])</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Get the first document in each group sorted by 'age' in
            descending order in 'users' collection</span></p>
    <pre><span>db.users.aggregate([</span><br><span>    { $sort: { age: -1 } },</span><br><span>    { $group: { _id: null, oldestUser: { $first: "$$ROOT" } } }</span><br><span>])</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Perform map-reduce operation to calculate the total age of all
            users</span></p>
    <pre><span>var mapFunction = function () {</span><br><span>    emit("totalAge", this.age);</span><br><span>};</span><br><br><span>var reduceFunction = function (key, values) {</span><br><span>    return Array.sum(values);</span><br><span>};</span><br><br><span>db.users.mapReduce(</span><br><span>    mapFunction,</span><br><span>    reduceFunction,</span><br><span>    { out: { inline: 1 } }</span><br><span>);</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>We use various stages such as</span><b><strong> $addFields, $out,
                $count,</strong></b><a href="https://www.geeksforgeeks.org/mongodb/mongodb-aggregation-group-command/"
            target="_blank" rel="noopener"><b><strong> $group</strong></b></a><b><strong>, </strong></b><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-aggregation-lookup/" target="_blank"
            rel="noopener"><b><strong>$lookup</strong></b></a><b><strong>, </strong></b><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-aggregation-first-operator/" target="_blank"
            rel="noopener"><b><strong>$first</strong></b></a><span>, and map-reduce for different aggregation
            operations.</span></p>
    <p dir="ltr" style="text-align: justify;"><span>Aggregation framework allows us to perform complex computations,
            transformations, and data analysis on MongoDB collections efficiently.</span></p>
    <h2><span>MongoDB Indexing</span></h2>
    <p dir="ltr" style="text-align: justify;"><a href="https://www.geeksforgeeks.org/mongodb/indexing-in-mongodb/"
            target="_blank" rel="noopener"><b><strong>Indexing </strong></b></a><span>enhances query performance and
            allows for efficient data retrieval in MongoDB</span></p>
    <p dir="ltr" style="text-align: justify;"><span>Let's Create a </span><a
            href="https://www.geeksforgeeks.org/mongodb/single-field-indexes-in-mongodb/" target="_blank"
            rel="noopener"><span>single field index</span></a><span> on the
            '</span><b><strong>username</strong></b><span>' field in the '</span><b><strong>users</strong></b><span>'
            collection</span></p>
    <pre><span>db.users.createIndex({ username: 1 })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Get the list of indexes on the 'users' collection</span></p>
    <pre><span>db.users.getIndexes()</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Drop the index on the 'username' field in the 'users'
            collection</span></p>
    <pre><span>db.users.dropIndex("username_1")</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Create a</span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-compound-indexes/" target="_blank" rel="noopener"><span>
                compound index</span></a><span> on the 'title' and 'content' fields in the 'posts' collection</span></p>
    <pre><span>db.posts.createIndex({ title: 1, content: 1 })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Create a </span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-multikey-indexes/" target="_blank"
            rel="noopener"><span>multikey index</span></a><span> on the 'tags' array field in the 'posts'
            collection</span></p>
    <pre><span>db.posts.createIndex({ tags: 1 })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Create a</span><a
            href="https://www.geeksforgeeks.org/mongodb/mongodb-text-indexes/" target="_blank" rel="noopener"><span>
                text index </span></a><span>on the 'content' field in the 'posts' collection</span></p>
    <pre><span>db.posts.createIndex({ content: "text" })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>Let's Create a</span><a
            href="https://www.geeksforgeeks.org/mongodb/unique-indexes-in-mongodb/" target="_blank"
            rel="noopener"><span> unique index</span></a><span> on the 'email' field in the 'users' collection</span>
    </p>
    <pre><span>db.users.createIndex({ email: 1 }, { unique: true })</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>We use createIndex() to create various types of indexes, such as
            single field, compound, multikey, text, and unique indexes. getIndexes() retrieves the list of indexes on a
            collection. dropIndex() drops an index by its name.</span></p>
    <h2><span>Transactions in MongoDB</span></h2>
    <p dir="ltr" style="text-align: justify;"><span>MongoDB supports multi-document </span><a
            href="https://www.geeksforgeeks.org/mongodb/acid-transactions-in-mongodb/" target="_blank"
            rel="noopener"><span>ACID transactions</span></a><span>, allowing for </span><b><strong>atomicity,
                consistency, isolation</strong></b><span>, and durability.</span></p>
    <pre><span>// Start a session</span><br><span>session = db.getMongo().startSession()</span><br><br><span>// Start a transaction</span><br><span>session.startTransaction()</span><br><br><span>try {</span><br><span>    // Perform operations within the transaction</span><br><span>    db.collection1.insertOne({ field1: "value1" }, { session: session })</span><br><span>    db.collection2.updateOne({ field2: "value2" }, { $set: { field3: "value3" } }, { session: session })</span><br><br><span>    // Commit the transaction</span><br><span>    session.commitTransaction()</span><br><span>} catch (error) {</span><br><span>    // Abort the transaction on error</span><br><span>    session.abortTransaction()</span><br><span>}</span></pre>
    <h2><span>Data Modeling in MongoDB</span></h2>
    <p dir="ltr" style="text-align: justify;"><a href="https://www.geeksforgeeks.org/mongodb/mongodb-data-modelling/"
            target="_blank" rel="noopener"><b><strong>Data modeling </strong></b></a><span>in MongoDB involves designing
            schemas and relationships between documents.</span></p>
    <pre><span>// Relationship: Embedding data in documents</span><br><span>db.users.insertOne({</span><br><span>    username: "john_doe",</span><br><span>    email: "john@example.com",</span><br><span>    posts: [</span><br><span>        { title: "Post 1", content: "Content 1" },</span><br><span>        { title: "Post 2", content: "Content 2" }</span><br><span>    ]</span><br><span>})</span><br><br><span>// Relationship: Referencing documents</span><br><span>db.comments.insertOne({</span><br><span>    user_id: ObjectId("user_id_here"),</span><br><span>    post_id: ObjectId("post_id_here"),</span><br><span>    content: "Comment content"</span><br><span>})</span><br><br><span>// Specify JSON schema validation</span><br><span>db.createCollection("collection_name", {</span><br><span>    validator: {</span><br><span>        $jsonSchema: {</span><br><span>            bsonType: "object",</span><br><span>            required: ["field1", "field2"],</span><br><span>            properties: {</span><br><span>                field1: {</span><br><span>                    bsonType: "string"</span><br><span>                },</span><br><span>                field2: {</span><br><span>                    bsonType: "number"</span><br><span>                }</span><br><span>            }</span><br><span>        }</span><br><span>    }</span><br><span>})</span><br><br><span>// Scaling in MongoDB involves sharding, replication, and proper index usage to distribute data across multiple servers.</span></pre>
    <p dir="ltr" style="text-align: justify;"><span>We demonstrate embedding data in documents and referencing documents
            to model relationships between collections. </span><a
            href="https://www.geeksforgeeks.org/javascript/javascript-json/" target="_blank"
            rel="noopener"><b><strong>JSON </strong></b></a><span>schema validation ensures data integrity by enforcing
            structure and data types. Scaling in </span><b><strong>MongoDB </strong></b><span>involves strategies like
            sharding and replication to handle large volumes of data.</span></p>
    <h2><span>Conclusion</span></h2>
    <p dir="ltr" style="text-align: justify;"><span>In conclusion, </span><b><strong>MongoDB</strong></b><span> is a
            powerful </span><b><strong>NoSQL database</strong></b><span> that provides excellent flexibility for
            handling </span><b><strong>large-scale and dynamic data</strong></b><span>. Its tools such as
        </span><b><strong>MongoDB Atlas</strong></b><span>, </span><b><strong>MongoDB Compass</strong></b><span> and the
        </span><b><strong>MongoDB Shell</strong></b><span>, simplify data management while the
        </span><b><strong>Aggregation Framework</strong></b><span> enables advanced querying and </span><b><strong>data
                analysis</strong></b><span>. </span></p>
    <p dir="ltr" style="text-align: justify;"><span>With its focus on scalability, performance, and ease of use, MongoDB
            is an ideal choice for modern applications. It's a preferred solution for developers and organizations
            seeking efficient, high-performance </span><b><strong>database systems</strong></b><span> in today’s
        </span><b><strong>data-driven landscape</strong></b><span>.</span></p>

</div>