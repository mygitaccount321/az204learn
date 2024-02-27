import React, { useEffect, useState } from 'react'
import { Container, Table } from 'react-bootstrap';

export const Student = () => {
    const [students, setStudents] = useState([]);

    useEffect(() => {
        const fetchData = async () => {
            try{
                const response = await fetch("/students", { method: 'GET',headers: { "Access-Control-Allow-Origin": "*"}});
                if(!response.ok){
                    throw new Error(response.statusText);
                }
                const result = await response.json();
                setStudents(result);
            } catch(error){
                console.log(error);
            }
        }
        fetchData();
    }, []);
    return (
        <><h1>Hello Az-204!</h1>
        
        <Container className="d-flex justify-content-center">
 <Table striped style={{ width: '100%'}} bordered hover >
      <thead>
        <tr>
          <th>Roll Number</th>
          <th>Name</th>
        </tr>
      </thead>
      <tbody>
      {students.map((student, key) => {
                    return (
                        <tr key={key}>
                            <td>{student.rollNumber}</td>
                            <td>{student.name}</td>
                        </tr>
                    )
                })}
      </tbody>
    </Table></Container></>
    )
}