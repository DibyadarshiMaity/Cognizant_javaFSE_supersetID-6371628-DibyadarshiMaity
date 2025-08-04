import React from "react";

function CourseDetails(props) {
  return (
    <div className="column">
      <h2>Course Details</h2>
      {props.courses.map((course) => (
        <div key={course.id}>
          <h3>{course.name}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;
