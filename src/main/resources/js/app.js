const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class Test extends React.Component{
    render() {
        return (
            <div>
                <p>hell</p>
                <a href="http://spring.learn.com/groups">spring.learn.com/groups</a>
            </div>
        );
    }
}
class Test1 extends React.Component{
    render() {
        return (
            <div>
                <p>hell</p>
            </div>
        );
    }
}

ReactDOM.render(<Test />,document.body);
