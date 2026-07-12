import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App" style={{ backgroundColor: '#f7fafc', minHeight: '100vh', display: 'flex', alignItems: 'center', justifyContent: 'center' }}>
      <CalculateScore Name="Dhairya Gothi" School="Cognizant Academy" Total={350} goal={4} />
    </div>
  );
}

export default App;
