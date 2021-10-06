import React from 'react';

import wppIcon from '../../images/icons/whatsapp.svg'

import './style.css'

function TeacherItem() {
    return (
        <article className="teacher-item">
            <header>
                <img src="https://avatars.githubusercontent.com/u/67684925?v=4" alt="Matheus Soares" />
                <div>
                    <strong>Matheus Soares</strong>
                    <span>Química</span>
                </div>
            </header>
            <p>
                Entusiasta das melhores tecnologias de química avançada.
                <br /><br />
                Apaixonado por explodir coisas em laboratório e por mudar a vida das pessoas através de experiências.
            </p>
            <footer>
                <p>
                    Preço/hora
                    <strong>R$ 80,00</strong>
                </p>
                <button type="button">
                    <img src={wppIcon} alt="Whatsapp" />
                    Entrar em contato
                </button>
            </footer>
        </article>
    );
}

export default TeacherItem;