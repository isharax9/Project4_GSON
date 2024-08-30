/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


async function sendObject() {
    const user = {
        id: 1,
        name: "Sahan",
        age: 20,
        country: "Sri Lanka"
    };

    const response = await fetch("X", {
        method: "POST",
        body: JSON.stringify(user),
        headers: {
            "Content-Type": "application/json"
        }
    }
    );

    if (response.ok) {
        const json = await response.json();
        console.log(json.message);
    }
}