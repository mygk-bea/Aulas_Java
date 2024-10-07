import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [react()],
  server: {
    // Configuração do proxy por erro de CORS na requisição da API
    proxy: {
      '/cat_api': {
        target: 'https://http.cat',
        changeOrigin: true,
        rewrite: (path) => path.replace(/^\/cat_api/, ''),
      },
    },
  },
})
