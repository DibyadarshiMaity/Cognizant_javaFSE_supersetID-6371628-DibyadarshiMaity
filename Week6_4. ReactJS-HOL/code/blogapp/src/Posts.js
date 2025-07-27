import React, { Component } from 'react';
import Post from './Post';
class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null
    };
  }

  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => {
        if (!response.ok) {
          throw new Error('Failed to fetch posts');
        }
        return response.json();
      })
      .then(data => {
        const postObjects = data.map(p => new Post(p.userId, p.id, p.title, p.body));
        this.setState({ posts: postObjects });
      })
      .catch(error => {
        this.setState({ error });
      });
  };

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert('An error occurred: ' + error.message);
  }

  render() {
    const { posts, error } = this.state;

    if (error) {
      return <h2>Error loading posts!</h2>;
    }

    return (
      <div>
        <h1>Blog Posts</h1>
        {posts.map(post => (
          <div key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
