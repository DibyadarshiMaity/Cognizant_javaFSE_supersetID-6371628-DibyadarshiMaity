import React from "react";
import "./App.css";
import CourseDetails from "./CourseDetails";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";

const courses = [
  { id: 1, name: "Harry Potter", date: "4/5/2021" },
  { id: 2, name: "The Prince Of Persia", date: "6/3/2021" },
];

const books = [
  { id: 1, bname: "The Mystery Of Time", price: 670 },
  { id: 2, bname: "The Black Hole", price: 800 },
  { id: 3, bname: "The History Of Space", price: 450 },
];

const blogs = [
  {
    id: 1,
    title: "Computer",
    author: "Stephen stark",
    description: "Know your machine and its working",
  },
  {
    id: 2,
    title: "The Beyonders",
    author: "marlyn roe",
    description: "Study The Power Of MetaHumans",
  },
];

function App() {
  return (
    <div className="container">
      <CourseDetails courses={courses} />
      <BookDetails books={books} />
      <BlogDetails blogs={blogs} />
    </div>
  );
}

export default App;
